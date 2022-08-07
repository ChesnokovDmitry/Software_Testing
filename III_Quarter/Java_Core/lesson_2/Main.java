package lesson_2;

public class Main {
    protected static boolean flag = true;

    public static void main(String[] args) {
        String[][] array4x4 = new String[4][4];
        //String[][] array5x4 = new String[5][4];
        //String[][] invalidArray = new String[4][4];
                
        try {
            array4x4 = new String[][]{{"1", "2", "3", "4"},
                    {"2", "3", "4", "1"},
                    {"3", "4", "1", "2"},
                    {"4", "1", "2", "3"}};
            /*array5x4 = new String[][]{{"1", "2", "3", "4"},
                    {"2", "3", "4", "1"},
                    {"3", "4", "1", "2"},
                    {"4", "1", "2", "3"},
                    {"4", "3", "2", "1"}};*/
            /*invalidArray = new String[][]{{"1", "2", "string", "4"},
                    {"2", "3", "2", "1"},
                    {"3", "4", "1", "2"},
                    {"4", "1", "2", "3"}};*/

            arraySizeCheck(array4x4);
            //arraySizeCheck(array5x4);
            //arraySizeCheck(invalidArray);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (flag) {
                    arrayConversion(array4x4);
                    //arrayConversion(array5x4);
                    //arrayConversion(invalidArray);
                }
            } catch (MyArrayDataException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void arraySizeCheck(String[][] arr) throws MyArraySizeException {
        if (arr.length == 4 && arr[0].length == 4)
            System.out.println("Массив валидный");
        else {
            flag = false;
            throw new MyArraySizeException();
        }
    }

    public static void arrayConversion(String[][] arr) throws MyArrayDataException {
        int num = 0;
        int line = 0;
        int column = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    line = i + 1;
                    column = j + 1;

                    if (arr[i][j].isEmpty())
                        num += 0;
                    else {
                        int parseInt = Integer.parseInt(arr[i][j]);
                        num += parseInt;
                    }
                }
            }

            System.out.println(num);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException(line, column);
        }
    }
}
