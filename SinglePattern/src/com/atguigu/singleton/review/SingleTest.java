package com.atguigu.singleton.review;

public class SingleTest {
    public static void main(String[] args) {

    }

    static class DoubleCheckSingle {
        private DoubleCheckSingle() {
        }

        private static DoubleCheckSingle INSTANCE;

        public static DoubleCheckSingle getInstance() {
            if (INSTANCE == null) {
                synchronized (DoubleCheckSingle.class){
                    if(INSTANCE==null){
                        INSTANCE = new DoubleCheckSingle();
                    }
                }
            }
            return INSTANCE;
        }
    }
}


