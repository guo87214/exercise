package test.exceptions;
class DynamicFieldsException extends Exception{}
public class DynamicFields  {
	private Object[] fields;
	public DynamicFields(int initialSize) {
		fields=new Object[initialSize];
		for(int i=0;i<initialSize;i++) {
			fields[i]=new Object[] {null,null};		}
	}
	public String toString() {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<fields.length;i++) {
			Object[] obj=(Object[]) fields[i];
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
	}
	private int hasField(String id) {
		for(int i=0;i<fields.length;i++) {
			if(id.equals(((Object[])(fields[i]))[0])) {
				return i;
			}
		}
		return -1;
	}
	private int getFieldNumber(String id) throws NoSuchFieldException {
		int fieldNum=hasField(id);
		if(fieldNum==-1) {
			throw new NoSuchFieldException();
		}
		return fieldNum;
	}
	private int makeField(String id) {
		for(int i=0;i<fields.length;i++) {
			Object[] obj=(Object[])(fields[i]);
			if(((Object[])(fields[i]))[0]==null) {
				((Object[])(fields[i]))[1]=id;
				return i;
			}
			Object[][] tmp=new Object[fields.length+1][2];
		}
		
		return a;
	}
}
