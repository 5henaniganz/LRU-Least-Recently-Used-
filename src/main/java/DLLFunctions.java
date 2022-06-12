public class DLLFunctions {
    DLL dll = new DLL();

    //Generates and adds to DLL limits to 5 nodes
    public void addToDll(int n) {
        for (int i = 0; i < n; i++) {
            if (dll.getCount() == 5) {
                dll.push(i);
                dll.pop();
            } else {
                dll.push(i);
            }
        }
    }

    //Prints list
    public void printDll() {
        dll.printlist(dll.head);
    }

    //Pushes to top and pops off the end
    public void push(int n) {
        dll.push(n);
        dll.pop();
    }
}