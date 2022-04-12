package Task12;

public class Visitor<T> implements TreeVisitor<T, String, String>  {

    int level = 0;
	@Override
	public String visit(Leaf<T> l, String result) {
        result += l.show(level);
        level++;
		return result;
	}

	@Override
	public String visit(Node<T> n, String result) {
		   result += n.show(level);
		for(Tree<T> t : n.getChildren())
            t.accept(this, result);
		return result;
	}
}
