class Solution {
    public int[] solution(String[] park, String[] routes) {
        Integer cLength = park[0].toCharArray().length;
        char[][] maps = new char[park.length][cLength];
        
        Integer startW =0;
        Integer startH = 0;
        
        for(int i = 0;i<park.length;i++){
            char[] point = park[i].toCharArray();
            
            for(int j = 0;j<point.length;j++){
                maps[i][j] = point[j];
                
                if(point[j] == 'S'){
                    startW = j;
                    startH = i;
                }
            }
        }
        Integer currentW = startW;
        Integer currentH = startH;
       
        for(int i = 0 ; i<routes.length;i++){
            String arrow = routes[i].substring(0,1);
            Integer step = Integer.parseInt(routes[i].substring(2));
            
            switch(arrow){
                case "E":
                    if((currentW+step) < maps[currentH].length){
                        boolean isX = false;
                        Integer cW = currentW;
                        for(int x = 1 ;x<=step;x++){
                            cW = cW+1;
                            if(maps[currentH][cW] == 'X')
                            {
                                isX = true;
                                break;
                            }
                        }
                        if(!isX){
                            currentW = currentW+step;
                        }
                    }
                    break;
                case "W":
                    if((currentW-step) >= 0){
                        boolean isX = false;
                        Integer cW = currentW;
                        for(int x = 1 ;x<=step;x++){
                            cW = cW -1;
                            if(maps[currentH][cW] == 'X')
                            {
                                isX = true;
                                break;
                            }
                        }
                        if(!isX){
                            currentW = currentW-step;
                        }
                    }
                    break;
                case "N":
                    if((currentH-step) >= 0){
                        boolean isX = false;
                        Integer cH = currentH;
                        for(int x = 1 ;x<=step;x++){
                            cH = cH - 1;
                             if(maps[cH][currentW] == 'X')
                            {
                                isX = true;
                                 break;
                            }
                        }
                        if(!isX){
                            currentH = currentH-step;
                        }
                    }
                    break;
                case "S":
                    if((currentH+step) < maps.length){
                        boolean isX = false;
                        Integer cH = currentH;
                        for(int x = 1 ;x<=step;x++){
                            cH = cH + 1;
                            if(maps[cH][currentW] == 'X')
                            {
                                isX = true;
                                break;
                            }
                        }
                        if(!isX){
                            currentH = currentH+step;
                        }
                    }
                    break;       
            }
        }
        int[] answer = {currentH,currentW};
        return answer;
    }
}