package io.yadnyesh.codingwithdurgesh;

public class SingletonExample {

    private static SingletonExample singletonExample;

    private SingletonExample() {

    }

    //Lazy way of creating singleton
    public synchronized static SingletonExample getSingletonExample() {
        // create object of this class
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }

        return singletonExample;
    }
}

/*
1. Make Constructor Private
2. create object with help of method
3. create field to store object
 */
