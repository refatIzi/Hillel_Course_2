package homework.seven;

public class ArrayValueCalculator {
    String[][] array = new String[4][4];

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int suma = 0;
        this.array = array;
        if (this.array.length > 4) {
            throw new ArraySizeException();
        } else {
            for (int i = 0; i < 4; i++) {
                if (this.array[i].length > 4) {
                    throw new ArraySizeException("index "+i);
                } else {
                    for (int j = 0; j < 4; j++) {
                        System.out.print(array[i][j] + " ");
                        try {
                            suma += Integer.parseInt(array[i][j]);
                        } catch (NumberFormatException e) {
                            throw new ArrayDataException(i, j, array[i][j]);
                        }
                    }
                }
                System.out.println("> " + suma);
            }
        }
        return suma;
    }
}
