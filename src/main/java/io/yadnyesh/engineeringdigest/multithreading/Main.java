package io.yadnyesh.engineeringdigest.multithreading;

public class Main {

    public static void main(String[] args) {
        ThreadWorld threadWorld = new ThreadWorld();
        threadWorld.run();

        ThreadExtends threadExtends = new ThreadExtends();
        threadExtends.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Main World: " + i);
        }
    }
}
