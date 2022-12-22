import java.util.*;
public class MergeSort_np03cs4a220326{
    public static void getInput(ArrayList<Integer> al) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number for index " + i);
            al.add(scanner.nextInt());
        }
        System.out.println("Unsorted array: ");
        System.out.println(al);
    }
    public static void getOutput(ArrayList<Integer> al) {
        System.out.println("Sorted Array: ");
        System.out.print("[");
        for (int i = 0; i < al.size(); i++) {
            if (i == al.size() - 1) {
                System.out.print(al.get(i));
            } else {
                System.out.print(al.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
    public static void merge(ArrayList<Integer> al, int beg, int mid, int end) {
        int beginning = beg;
        int midIndex = mid + 1;
        int ending = end;

        while (beg <= midIndex && midIndex <= end) {
            if (al.get(beg) > (al.get(midIndex))){
                al.add(beg, al.remove(midIndex));
                beg++;
                midIndex++;
            } else if (Objects.equals(al.get(beg), al.get(midIndex))) {
                al.add(beg , al.remove(midIndex));
                beg++;
                midIndex++;
            } else {
                beg++;
            }
        }
    }
    public static void sort(ArrayList<Integer> al, int begin, int end) {
        if(begin<end) {
            int mid = (begin + end) / 2;
            sort(al, begin, mid);
            sort(al,mid+1, end);
            merge(al, begin, mid, end);
        }
    }
    public static void main(String[] args) {
        MergeSort_np03cs4a220326 ob = new MergeSort_np03cs4a220326();
        ArrayList<Integer> al = new ArrayList<>();
        ob.getInput(al);
        ob.sort(al, 0, al.size()-1);
        ob.getOutput(al);
    }
}