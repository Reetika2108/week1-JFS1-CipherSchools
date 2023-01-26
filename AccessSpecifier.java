
public class AccessSpecifier {
	public String iamAccessibleEveryWhere;
    private String iamAccessibleOnlyHere;
    protected  String iamAccessibleToDerivedClass;
    String iamAccessibletoSamePackage;
	public String getIamAccessibleOnlyHere() {
		return iamAccessibleOnlyHere;
	}
	public void setIamAccessibleOnlyHere(String iamAccessibleOnlyHere) {
		this.iamAccessibleOnlyHere = iamAccessibleOnlyHere;
	}
}
