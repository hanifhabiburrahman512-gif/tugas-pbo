import java.util.Random;

// Class utama harus sama dengan nama file
public class TestStopWatch {
    public static void main(String[] args) {
        int size = 100000; 
        double[] numbers = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextDouble() * 100000;
        }

        StopWatch sw = new StopWatch();
        
        System.out.println("Memulai pengurutan 100.000 angka (mohon tunggu...)...");
        
        sw.start(); 
        selectionSort(numbers);
        sw.stop();  

        System.out.println("Pengurutan selesai.");
        System.out.println("Waktu eksekusi: " + sw.getElapsedTime() + " milidetik.");
    }

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

// Hapus 'public' di sini jika dalam satu file dengan TestStopWatch
class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}