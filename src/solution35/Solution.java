//package solution35;
//
//public class Solution {
//	
//    public ListNode reverse(ListNode head) {
//        // write your code here
//    	if(head.next.next==null){
//    		head.next.next=head;
//    		head.next=null;
//    		return head;
//    	}
//    	ListNode tmpList=new ListNode();
//    	while(head.next!=null){
//    		ListNode tmp=head.next;
//    		head.next=tmpList;
//    		head=tmp; 		
//    	}
//    	return tmpList;
//    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
