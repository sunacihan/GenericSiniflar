public class Main {
    public static void main(String[] args) {

        MyyList<Integer> liste = new MyyList<>();
        System.out.println(liste.isEmpty()?"Boş":"Dolu");
        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);
        liste.add(10);
        liste.add(70);
        liste.add(80);
        liste.add(90);


        System.out.println("Eleman sayısı:"+liste.size());
        System.out.println("Kapasite:"+liste.getCapacity());
        System.out.println("3.Eleman :"+liste.get(3));
        System.out.println("3. elemana 45 atıyorum:"+liste.set(3,45));
        liste.tosString();
        liste.remove(3);
        liste.tosString();
        System.out.println(liste.indexOf(200));
        System.out.println(liste.lastindexOf(20));
        System.out.println(liste.isEmpty()?"Boş":"Dolu");
        Object[] dizi=liste.toArray();
        System.out.println("Object dizisinin ilk elemanı :"+dizi[0]);

        System.out.println(liste.contains(50));
        System.out.println(liste.contains(100));
        liste.clear();
        liste.tosString();
        System.out.println("Kapasite:"+liste.getCapacity());

        liste.tosString();
    }
}