//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        readData();


    }

    public static int[] readData() {

        int[] tempList = new int[] {-20, 30, -40, 50, 10, -10};
        for (int i = 0; i < tempList.length; i++) {
        }return tempList;


    public static int getMaxLenOfPositives (int [] tempList) {
    int maxLenght = 0;
    int count =0;
    for (int t:tempList){
        if (t>0){
            count++;
        } else {
            if (count>maxLenght) {
                maxLenght = count;
            }
            return getMaxLenOfPositives;
        }
    }

    public void showResult(int result) {
        return result;
    }

}
