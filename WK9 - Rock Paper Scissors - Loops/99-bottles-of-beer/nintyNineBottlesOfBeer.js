//99-bottles-of-beer

function showLyrics(){
    for (i = 99; i >= 0; i--){
        
        if( i == 0 ){
            document.getElementById("content").innerHTML += "<br\> No more bottles of beer on the wall, no more bottles of bee <br\> Go to the store and buy some more, 99 bottles of beer on the wall <br\>";
            return; 
        }else if (i==1){
            
            document.getElementById("content").innerHTML +="<br\>"+ i + " bottle of beer on the wall," + i + " bottle of beer. <br\> Take one down and pass it around,"+ (i-1) + " bottle of beer on the wall<br\>";
         }
        else { 
            
            document.getElementById("content").innerHTML +="<br\>"+ i + " bottles of beer on the wall, " + i + " bottles of beer. <br\> Take one down and pass it around," + (i-1) + " bottles of beer on the wall<br\>";
        }
		
    }
}
