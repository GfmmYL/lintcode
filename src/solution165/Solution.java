package solution165;

public class Solution {
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
    	ListNode result=new ListNode(0);
    	ListNode cur=result;
    	
    	while(l1!=null && l2!=null){
    		if(l1.val<l2.val){
    			cur.next=l1;
    			l1=l1.next;
    		}
    		else{
    			cur.next=l2;
    			l2=l2.next;
    		}
    		cur=cur.next;
    	}
    	
    	if(l1!= null){
    		cur.next=l1;
    	}
    	else{
    		cur.next=l2;
    	}
    	return result.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
