package org.tsypk.questions;

public class TryCatchFinally {
    public int first() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public int second() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public int third() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            return 3;
        }
    }

    public int fourth() {
        try {
            throw new RuntimeException("try");
        } catch (Exception e) {
            throw new RuntimeException("catch");
        } finally {
            //
        }
    }

    public int fifth() {
        try {
            throw new RuntimeException("try");
        } catch (Exception e) {
            throw new RuntimeException("catch");
        } finally {
            throw new RuntimeException("finally");
        }
    }
}
