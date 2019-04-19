public class main {
    public static void main(String[] args){
        Trie trie = new Trie();

        trie.insert("holograma");
        trie.insert("hola");

        trie.insert("aitor");
        trie.insert("roca");
        trie.insert("russia");
        trie.insert("rosa");

        trie.remove_T("rosa");
        boolean resultat3 = trie.search("rosa");
        boolean resultat4 = trie.search("roca");
        System.out.println("END");
    }
}
