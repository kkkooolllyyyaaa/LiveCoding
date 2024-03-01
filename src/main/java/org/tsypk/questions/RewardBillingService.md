```java
@Service
public class RewardBillingService {

    @Autowired
    private RewardRepository rewardRepository;
    @Autowired
    private TariffRepository tariffRepository;
    @Autowired
    private RewardRestClient rewardRestClient;

    @Transactional
    public void handleRewards(List<Employee> employees) {
        for (Employee employee : employees) {
            List<Reward> rewards = rewardRepository.findByEmployeeId(employee.getId());
            for (Reward reward : rewards) {
                if (List.of("speech", "lesson", "help").contains(reward.getType())) {
                    Tariff tariff = tariffRepository.findByTypeAndDate(reward.getType(), new Date()).get();

                    double amount = (1 + employee.getBonusCoefficient()) * tariff.getAmount();

                    rewardRestClient.payReward(employee.getId(), amount);
                    System.out.println("Отправлен платеж");

                    reward.setStatus("paid");
                    rewardRepository.save(reward);
                }
            }
        }
    }
}
```
