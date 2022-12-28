package DesignPatterns.BuilderPattern.nadavEx;

public class Main {
    public static void main(String[] args) {

        Dialog dialog = new Dialog.Builder()
                .addTitle("Dialog title")
                .setNegativeClickListener(() -> {
                    System.out.println("Canceled");
                })
                .setPositiveClickListener(() -> {
                    System.out.println("Positive");
                })
                .build();
    }
}
