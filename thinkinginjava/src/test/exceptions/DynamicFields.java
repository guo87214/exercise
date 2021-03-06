package test.exceptions;

import net.mindview.util.Print;

class DynamicFieldsException extends Exception{}
public class DynamicFields  {
	private Object[][] fields;
	public DynamicFields(int initialSize) {
		fields=new Object[initialSize][2];
		for(int i=0;i<initialSize;i++) {
			fields[i]=new Object[] {null,null};		
			}
	}
	public String toString() {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<fields.length;i++) {
			Object[] obj=fields[i];
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
	}
	private int hasField(String id) {
		for(int i=0;i<fields.length;i++) {
			if(id.equals(fields[i][0])) {
				return i;
			}
		}
		return -1;
	}
	private int getFieldNumber(String id) throws NoSuchFieldException {
		int fieldNum=hasField(id);
		
		  if(fieldNum==-1) { throw new NoSuchFieldException();
		  
		  }
		 
		return fieldNum;
	}
	private int makeField(String id) {
		for(int i=0;i<fields.length;i++) {
			
			if(fields[i][0]==null) {
				fields[i][0]=id;
				return i;
			}
		}
			Object[][] tmp=new Object[fields.length+1][2];
			for(int i=0;i<tmp.length;i++) {
				if(i<tmp.length-1) {
				tmp[i]=fields[i];
				}else {
				tmp[i]=new Object[] {null,null};}
			}
		fields=tmp;
		return makeField(id);
	}
	public Object getField(String id) throws NoSuchFieldException {
		return fields[getFieldNumber(id)];
	}
	public void setField(String id,Object value) throws DynamicFieldsException {
		if(value==null) {
			DynamicFieldsException dfe=new DynamicFieldsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		int fieldNumber=hasField(id);
		if(fieldNumber==-1) {
			fieldNumber=makeField(id);
		}
		fields[fieldNumber][1]=value;
		/*
		 * Object result; try { result=getField(id); }catch (NoSuchFieldException e) {
		 * // TODO: handle exception throw new RuntimeException(e); }
		 */
		/*
		 * result=value; Print.print("&&&&&&&&&&&&&&&"+result); return result;
		 */
	}
	public static void main(String[] args) {
		DynamicFields df=new DynamicFields(3);
		Print.print(df);
		try {
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			Print.print(df);
			df.setField("d", "A new value for d");
			df.setField("number3", 11);
			Print.print("df:"+df);
			Print.print("df.getField(\"d\"):"+df.getField("d"));
			df.setField("d", null);
			
		}catch (NoSuchFieldException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		} catch (DynamicFieldsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
			e.printStackTrace();
		}
	}
}
