class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        sorted_intervals=sorted(intervals, key=lambda x: x[0])
        print(intervals)
        ans=[]
        current_list=sorted_intervals[0]
        for i in sorted_intervals:
            temp=i
            if(current_list[1]>=temp[0]):
                current_list[1]=max(current_list[1],temp[1])
            else:
                ans.append(current_list)
                current_list=temp
        ans.append(current_list)
        return ans
                

        
