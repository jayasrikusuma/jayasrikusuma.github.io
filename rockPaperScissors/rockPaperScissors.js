	
		function checkWinner(){
			var player1 = document.getElementById("player1").value;
			var player2 = document.getElementById("player2").value;

			
			if( player1 == "Rock" && player2 =="Paper"){			
				alert("Player 2 wins \nPlayer1: " + player1 + "; Player2: "+ player2);

			} else if( player1 == "Paper" && player2 =="Scissors"){		
				alert("Player 2 wins \nPlayer1: "+player1 +"; Player2: "+ player2);

			} else if( player1 == "Scissors" && player2 =="Rock"){		
				alert("Player 2 wins \nPlayer1: "+player1 +"; Player2: "+ player2);

			} else if(( player1 == "Rock" && player2 =="Scissors") || ( player1 == "Paper" && player2 =="Rock") || ( player1 == "Scissors" && player2 =="Paper") ){			
				alert("Player1 wins \nPlayer1: "+player1 +"; Player2: "+ player2);	
				
			}else if( (player1 == "Rock" & player2 =="Rock") | (player1 == "Paper" & player2 =="Paper") | (player1 == "Scissors" & player2 =="Scissors") ){ 
				alert("Its a draw");
		
			}
			
			
		}