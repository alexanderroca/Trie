public class main {
    public static void main(String[] args){
        Trie trie = new Trie();

        trie.insert("holograma");
        boolean resultat = trie.search("holograma");
        trie.insert("hola");
        boolean resultat2 = trie.search("ho");

        trie.insert("aitor");
        trie.insert("roca");
        trie.insert("russia");
        trie.insert("rosa");
    }
}
