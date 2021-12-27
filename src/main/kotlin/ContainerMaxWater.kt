//15  LeetCode  https://leetcode.com/problems/container-with-most-water/

class ContainerMaxWater {
        fun maxArea(height: IntArray): Int {

            var max_area =0
            var punto_a  =0
            var punto_b =height.size-1

            while(punto_a < punto_b){
                if (height[punto_a]<height[punto_b]){
                    max_area = Math.max(max_area, height[punto_a]*(punto_b-punto_a))
                    punto_a +=1

                }else{
                    max_area = Math.max(max_area, height[punto_b]* (punto_b - punto_a))
                    punto_b -=1
                }
            }
            return max_area

        }
    }
