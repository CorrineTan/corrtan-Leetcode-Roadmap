public void backTrack(int i, int[] nums, List<List<Integer>> sets,List<Integer> subset){
        sets.add(new ArrayList<Integer>(subset));
        if(i >= nums.length){
            return;
        }
        for(int j = i; j < nums.length; j++){ //i=j=0  nums=[1,2,3]   //j=1
            subset.add(nums[j]); //subnet = [1]      //subnet = [2]
            backTrack(j+1,nums,sets,subset){  //i=1    //i=2
                sets.add(new ArrayList<Integer>(subset)); //sets = [[],[1]]    //set = [[],[1],[1,2], [1,2,3]. [2]]
                if(i >= nums.length){
                    return;
                }
                for(int j = i; j < nums.length; j++){ //j=i=1
                    subset.add(nums[j]); //[1,2]
                    backTrack(j+1,nums,sets,subset){ //i=2
                        sets.add(new ArrayList<Integer>(subset)); //sets=[[],[1],[1,2]]
                        if(i >= nums.length){
                            return;
                        }
                        for(int j = i; j < nums.length; j++){ //j=i=2
                            subset.add(nums[j]); //[1,2,3]
                            // backTrack(j+1,nums,sets,subset) { //i=3
                            //     sets.add(new ArrayList<Integer>(subset)); //sets=[[],[1],[1,2], [1,2,3]]
                            //     if(i >= nums.length){ //i need to return
                            //         return;
                            //     }
                            //     for(int j = i; j < nums.length; j++){
                            //         subset.add(nums[j]);
                            //         backTrack(j+1,nums,sets,subset);
                            //         subset.remove(subset.size()-1);
                            //     }
                            // }
                            // }
                            subset.remove(subset.size()-1); //[1,2]
                        }
                    }
                    }
                    subset.remove(subset.size()-1); // [1]
                }
            }
            subset.remove(subset.size()-1); // []
        }
    }
Footer
