public int maxDepth(TreeNode root) { //r=3
        if(root == null) return 0;
        int left = maxDepth(root.left){ //20

                if(root == null) return 0;
                // int left = maxDepth(root.left){ //15
                
                //         if(root == null) return 0;
                //         // int left = maxDepth(root.left){ //15.left = 0
                //         //         if(root == null) return 0;         
                //         // }
                //         int right = maxDepth(root.right); //15.right = 0
                //         int childMaxDepth = Math.max(left,right); // max = 0
                //         return childMaxDepth + 1; // child = 1
                // }                                                               =======》 return 1
                int right = maxDepth(root.right);   //7                            =======> return 1
                int childMaxDepth = Math.max(left,right);    // return 1
                return childMaxDepth + 1; // return left=child = 2
        }
        int right = maxDepth(root.right); //9           ====》 right = return1
        int childMaxDepth = Math.max(left,right);   // max(2,1) = 2
        return childMaxDepth + 1;   // 2+1 = 3
    }