package Task12;

public class Visitor<T> implements TreeVisitor<T, String, String>  {

    int level = 0;

	public String show(Tree<T> t) {
		String indent = "";
		for(int i=0; i<level; i++) {
			indent += "\t"; 
		}
		return indent+t.getValue().toString() + "\n";
	}
	@Override
	public String visit(Leaf<T> l, String result) {
        result += show(l);
		return result;
	}

	@Override
	public String visit(Node<T> n, String result) {
		result += show(n);

		level++;
		for(Tree<T> t : n.getChildren())
            result += t.accept(this, "");
		level--;
		return result;
	}
}
