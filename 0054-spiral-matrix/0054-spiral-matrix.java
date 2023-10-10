class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        int rowstart =0;
        int rowend = matrix.length-1;
        int colstart = 0;
        int colend = matrix[0].length-1;

        if(matrix == null || matrix.length ==0){
            return result;
        }

        //  if(colstart==colend){
        //     for(int i=rowstart; i<=rowend; i++){
        //     result.add(matrix[i][colend]);
        // }
        // return result;
        // }

        // if(rowstart==rowend){
        //     for(int i=colstart; i<=colend; i++){
        //     result.add(matrix[rowstart][i]);
        // }
        // return result;
        // }

        while(rowstart <= rowend && colstart <= colend){

            //Top
            for(int i=colstart; i<=colend; i++){
                result.add(matrix[rowstart][i]);
            }
            //Right
            for(int i=rowstart+1; i<=rowend; i++){
                result.add(matrix[i][colend]);
            }
            //bottom
            for(int i=colend-1; i>=colstart; i--){
                if(rowstart == rowend){
                    break;
                }
                result.add(matrix[rowend][i]);
            }
            //left
            for(int i=rowend-1; i>=rowstart+1; i--){
                if(colstart == colend){
                    break;
                }
                result.add(matrix[i][colstart]);
            }

            rowstart++;
            rowend--;
            colstart++;
            colend--;
        }
        return result;
    }
}