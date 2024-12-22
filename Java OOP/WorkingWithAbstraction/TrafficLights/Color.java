package WorkingWithAbstraction.TrafficLights;

public enum Color {

    RED,
    GREEN,
    YELLOW;

    public static void changeColor(Color[] colors) {

        for (int i = 0; i < colors.length; i++) {

            switch (colors[i]){
                case RED:
                    colors[i] = Color.GREEN;
                    break;
                case GREEN:
                    colors[i] = Color.YELLOW;
                    break;
                case YELLOW:
                    colors[i] = Color.RED;
                    break;
            }
        }
    }

    public static void printColors(Color[] colors) {
        for (Color color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }

}
