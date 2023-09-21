public class Tree {
    private Tree root;
    private String[] subtree;
    public Tree(Tree root, String[] subtree){
        this.root = root;
        this.subtree = subtree;
    }
    public Tree getroot(){
        return this.root;
    }
}
