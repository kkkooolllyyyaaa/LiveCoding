package org.tsypk.questions;

public class DataUser {

    public void useDuplicated(Data data) {
        Data[] datas = new Data[]{data, data};
        Integer.valueOf()
        use(datas);
        use(datas);
    }

    private void use(Data[] datas) {
        System.out.println(datas[0] + " " + datas[1]);
        datas = null;
        // ...
    }
}
