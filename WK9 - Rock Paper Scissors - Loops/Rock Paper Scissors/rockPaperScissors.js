	var attempt = 3; // attempt counter
		function checkWinner(){
			var player1 = document.getElementById("player1").value;
			
			var allowedValues = ['Rock', 'Paper', 'Scissors']; 
			var player2 = allowedValues[(Math.random() * allowedValues.length) | 0]
			
			
			alert("Attempts Left: "+ attempt);
			
			if( player1 == "Rock" && player2 =="Paper"){			
				alert("Player 2 wins \nPlayer1: " + player1 + "; Player2: "+ player2); 
				attempt --;// Decrementing by one.

			} else if( player1 == "Paper" && player2 =="Scissors"){		
				alert("Player 2 wins \nPlayer1: "+player1 +"; Player2: "+ player2);
				attempt --;// Decrementing by one.

			} else if( player1 == "Scissors" && player2 =="Rock"){		
				alert("Player 2 wins \nPlayer1: "+player1 +"; Player2: "+ player2);
				attempt --;// Decrementing by one.

			} else if(( player1 == "Rock" && player2 =="Scissors") || ( player1 == "Paper" && player2 =="Rock") || ( player1 == "Scissors" && player2 =="Paper") ){			
				alert("Player1 wins \nPlayer1: "+player1 +"; Player2: "+ player2);	
				
			}else if( (player1 == "Rock" & player2 =="Rock") | (player1 == "Paper" & player2 =="Paper") | (player1 == "Scissors" & player2 =="Scissors") ){ 
				alert("Its a draw. \nPlayer1: "+player1 +"\n Player2: "+ player2);	
		
			}
			
				
			
			if( attempt == 0){
				document.getElementById("player").style.display="none";	
			document.getElementById("btn").style.display="none";
				showMessage();
				
			}

			
		}
		
		function showMessage(){			
			document.getElementById("content1").style.display="block";
			
			/*[insert user name], thank you for your details. We will be in touch via [insert user email] shortly. */
			document.getElementById("content1").innerHTML += ("<h3>You have reached maximum tries. Play again!.</h3>");

		}
		
		
		
