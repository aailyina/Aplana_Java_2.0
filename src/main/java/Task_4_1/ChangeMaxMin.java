package Task_4_1;

public class ChangeMaxMin {
    void change() {
        int[] array;
        array = new int[20];
        int max=-100, min=100, indexmax=0, indexmin=0;
        for (int i = 0; i < array.length; i++){ //в цикле заполняется массив
            array[i] = ((int)(Math.random()*21)-10); //диапазон случайных чисел будет [-10;11) 11-исключительно.
            System.out.print(array[i]+" "); //вывод массива, заполненного случайными числами
        }
        System.out.println();
        for (int i=0; i<array.length; i++) {
            if ((array[i]<0) && (array[i]>=max)) {
                max=array[i];
                indexmax=i+1;
            }
            if ((array[i]>0) && (array[i]<=min)) {
                min = array[i];
                indexmin=i+1;
            }
        }
        System.out.println("Максимальный отрицательный элемент = "+ max +" Индекс элемента = "+indexmax);
        System.out.println("Минимальный положительный элемент = "+ min+" Индекс элемента = "+indexmin);
        array[indexmax-1]=min;
        array[indexmin-1]=max;
        System.out.println("Поменяли местами max и min");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}
