import java.lang.reflect.Array;

public class Tree {
    private Tree root;
    private Tree[] subtrees;
    public Tree(Tree root, Tree[] subtrees){
        this.root = root;
        this.subtrees = subtrees;

    }
}
