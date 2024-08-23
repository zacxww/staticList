public class StaticList {
    private int[] data;
    private int size;
    private int count;

    public StaticList(int size) {
        this.size = size;
        this.data = new int[size];
        this.count = 0;
    }

    public void clear() {
        this.count = 0;
    }

    public void add(int data) {
        if (!isFull()) {
            this.data[count++] = data;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public void add(int data, int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Posição Inválida!");
        } else if (!isFull()) {
            for (int i = count; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[pos] = data;
            count++;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public int remove(int pos) {
        if (pos < 0 || pos >= count) {
            System.out.println("Posição Inválida!");
            return -1;
        } else {
            int removedData = this.data[pos];
            for (int i = pos; i < count - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            count--;
            return removedData;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void setData(int data, int pos) {
        if (pos < 0 || pos >= count) {
            System.out.println("Posição Inválida!");
        } else {
            this.data[pos] = data;
        }
    }

    public int getData(int pos) {
        if (pos < 0 || pos >= count) {
            System.out.println("Posição Inválida!");
            return -1;
        } else {
            return this.data[pos];
        }
    }

    public int getSize() {
        return count;
    }

    public int find(int data) {
        for (int i = 0; i < count; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
