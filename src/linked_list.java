import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) throws Exception {
        
        LinkedList <String> saya = new LinkedList<>();
        saya.add("N");
        saya.add("A");
        saya.add("D");
        saya.add("A");
        saya.add("");
        saya.add("S");
        saya.add("A");
        saya.add("F");
        saya.add("A");
        saya.add("R");
        saya.add("I");
        saya.add("N");
        saya.add("A");
        System.out.println("\nNama Lengkap: "+saya+" -> Size = "+saya.size());

        //ADD KARAKTER
        saya.addFirst("#");
        saya.addLast("$");
        saya.add(14, "1025");
        System.out.println("\nData setelah penambahan addFirst & addLast: ");
        System.out.println(saya+" -> Size = "+saya.size());

        //SISIP KARAKTER
        saya.set(5, "%");
        saya.set(0, "@");
        saya.set(15, "~");
        System.out.println("\nData setelah disisip: (%, @, ~)");
        System.out.println(saya+" -> Size = "+saya.size());

        //HAPUS KARAKTER
        saya.removeLast();
        saya.remove(5);
        System.out.println("\nData setelah penghapusan beberapa karakter:");
        System.out.println(saya+" -> Size = "+saya.size());

        //POP DATA
        saya.pop();
        System.out.println("\nData setelah dilakukan pop: ");
        System.out.println(saya+" -> Size = "+saya.size());

        //PUSH DATA
        saya.push(":");
        saya.push("e");
        saya.push("m");
        saya.push("a");
        saya.push("n");
        System.out.println("\nData setelah dilakukan push: ");
        System.out.println(saya+" -> Size = "+saya.size());
    }
}