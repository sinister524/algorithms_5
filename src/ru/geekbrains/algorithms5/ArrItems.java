package ru.geekbrains.algorithms5;

public class ArrItems {
    private Item array [];
    private int size;
    public ArrItems (int size) {
        this.size = size;
        this.array = new Item[size];
    }
    public void setElement(int index, Item elem){
        this.array[index] = elem;
    }
    public void sortInsert(){
        int in, out;
        for(out = 1;out < this.size; out++){
            Item temp = new Item(this.array[out].getName(),this.array[out].getPrice(),this.array[out].getWeight());
            in = out;
            while(in > 0 && this.array[in-1].getRatio() >=temp.getRatio()){
                this.array[in] = this.array[in-1];
                --in;
            }
            this.array[in] = temp;
        }
    }

    public int getSize() {
        return size;
    }
    public Item getElem (int index) {
        return this.array[index];
    }
}
