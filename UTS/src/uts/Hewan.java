package uts;

class Hewan {

    protected String jenisSuara;

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println(jenisSuara);
    }
}
