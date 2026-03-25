public class task3 {
    public static void main(String[] args) {

        int amountOfBricksfarouk = 73;
        int containerCapacityfarouk = 6;

        int fullContainersfarouk = amountOfBricksfarouk / containerCapacityfarouk;
        int remainingBricksfarouk = amountOfBricksfarouk % containerCapacityfarouk;
        int totalContainersfarouk;

        if (remainingBricksfarouk > 0) {
            totalContainersfarouk = fullContainersfarouk + 1;
        } else {
            totalContainersfarouk = fullContainersfarouk;
        }

        System.out.println("Total Lego bricks: " + amountOfBricksfarouk);
        System.out.println("Container capacity: " + containerCapacityfarouk);

        System.out.println("Full containers: " + fullContainersfarouk);
        System.out.println("Total containers needed (including not full): " + totalContainersfarouk);

        System.out.println("Blocks in the not completely full container: " + remainingBricksfarouk);

    }
}
