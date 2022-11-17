class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        //first rectangle
        int first_rectangle_area = (ax2-ax1) * (ay2-ay1);
        //second rectangle
        int second_rectanlge_area = (bx2-bx1) * (by2-by1);
        //common area
       // int common_area = (Math.min(ax2,bx2)-Math.max(ax1,bx1)) * c;
        int common_area=0;
        int cl = (Math.min(ax2,bx2)-Math.max(ax1,bx1));
        int ch = (Math.min(ay2,by2)-Math.max(ay1,by1));
        if(cl>0 && ch>0){
            common_area = cl * ch;
        }
        
        return first_rectangle_area + second_rectanlge_area - common_area;
    }
}