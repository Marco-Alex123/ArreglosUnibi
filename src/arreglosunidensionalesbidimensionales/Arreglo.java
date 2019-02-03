package arreglosunidensionalesbidimensionales;

import java.util.Scanner;

public class Arreglo {

    private int[] array;
    private int ren, col, x, y;
    private int size;
    private int data;

    public Arreglo(int ren, int col) {
        this.ren = ren;
        this.col = col;
        array = new int[ren * col];
    }

    public Arreglo() {
        this.ren = 3;
        this.col = 3;
        array = new int[ren * col];
    }

    public double bigger(int index, double big) {
        if (index >= array.length) {
            return big;
        } else if (array[index] >= big) {
            big = array[index];
        }
        return bigger(++index, big);
    }

    public double sumatoria(int index) {
        if (index == array.length - 1) {
            return array[index];
        } else {
            return array[index] + sumatoria(++index);
        }
    }
    //busqueda secuencial

    private int searchY(int i, int j) {
        if (j >= col) {
            return -1;
        }
        if (array[(ren * i) + j] == data) {
            return j;
        } else {
            return searchY(i, ++j);
        }
    }

    public int[] search(int i) {
        if (i >= ren) {
            return new int[]{-1, -1, -1};
        }
        int j = searchY(i, 0);
        if (j != -1) {
            return new int[]{i, j, data};
        } else {
            return search(++i);
        }
    }

    public double binarySearch() {
        return 0;
    }

    public void read() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                array[(ren * j) + i] = leer.nextInt();
            }
        }
    }

    public static void print(Arreglo a) {

            System.out.println("");
            for (int i = 0; i < a.getRen(); i++) {
                for (int j = 0; j < a.getCol(); j++) {
                    System.out.print(a.getArray()[a.getRen() * j + i] + "\t");
                }
                System.out.println("");

            }

    }

    public void fill(int n, int m) {
        
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                array[(ren * j) + i] = (int) Math.abs(Math.floor(Math.random() * (n - m + 1) + m));
                //System.out.print(ren*j+i+" " );
            }
        }
    }

    public int getRen() {
        return ren;
    }

    public void setRen(int ren) {
        this.ren = ren;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public Arreglo multiplicarmatriz(Arreglo matriz, Arreglo matriz2, Arreglo matriz3) {
        int[] multiplicacion = new int[ren];

        for (int i = 0; i < matriz.getRen(); i++) {
            for (int j = 0; j < matriz2.getCol(); j++) {
                for (int k = 0; k < matriz.getCol(); k++) {
                    matriz3.getArray()[(matriz3.getRen() * j) + i]
                            += (matriz.getArray()[(matriz.getRen() * k) + i])
                            * (matriz2.getArray()[(matriz2.getRen() * j) + k]);
                }
            }
        }
        return matriz3;
    }


}
