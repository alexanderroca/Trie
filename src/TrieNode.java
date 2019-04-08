import java.util.ArrayList;

public class TrieNode {
    private boolean endOfWord;
    private TrieNode[] sons;

    public TrieNode(){
        endOfWord = false;
        for(int i = 0; i < Trie.ALPHABET; i++)
            sons[i] = null;
    }

    public boolean isEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public TrieNode[] getSons() {
        return sons;
    }

    public void setSons(TrieNode[] sons) {
        this.sons = sons;
    }
}
