// script.js

const boardElement = document.getElementById("chess-board");
let selectedPiece = null;
let gameState = [
  ["R", "N", "B", "Q", "K", "B", "N", "R"],
  ["P", "P", "P", "P", "P", "P", "P", "P"],
  ["", "", "", "", "", "", "", ""],
  ["", "", "", "", "", "", "", ""],
  ["", "", "", "", "", "", "", ""],
  ["", "", "", "", "", "", "", ""],
  ["p", "p", "p", "p", "p", "p", "p", "p"],
  ["r", "n", "b", "q", "k", "b", "n", "r"]
];

// Initialize the board with squares and pieces
function initBoard() {
  boardElement.innerHTML = "";
  for (let row = 0; row < 8; row++) {
    for (let col = 0; col < 8; col++) {
      const square = document.createElement("div");
      square.classList.add("square", (row + col) % 2 === 0 ? "light" : "dark");
      square.dataset.row = row;
      square.dataset.col = col;

      const piece = gameState[row][col];
      if (piece) {
        const pieceElement = document.createElement("span");
        pieceElement.classList.add("piece");
        pieceElement.textContent = piece;
        pieceElement.dataset.row = row;
        pieceElement.dataset.col = col;
        pieceElement.onclick = selectPiece;
        square.appendChild(pieceElement);
      }
      square.onclick = movePiece;
      boardElement.appendChild(square);
    }
  }
}

// Select a piece to move
function selectPiece(e) {
  const pieceElement = e.target;
  selectedPiece = pieceElement;
}

// Move the selected piece if valid
function movePiece(e) {
  if (!selectedPiece) return;

  const targetSquare = e.currentTarget;
  const fromRow = parseInt(selectedPiece.dataset.row);
  const fromCol = parseInt(selectedPiece.dataset.col);
  const toRow = parseInt(targetSquare.dataset.row);
  const toCol = parseInt(targetSquare.dataset.col);

  // Check if the move is valid for the piece type
  if (isValidMove(fromRow, fromCol, toRow, toCol, selectedPiece.textContent)) {
    gameState[toRow][toCol] = selectedPiece.textContent;
    gameState[fromRow][fromCol] = "";
    selectedPiece = null;
    initBoard();
  }
}

// Basic move validation for each piece
function isValidMove(fromRow, fromCol, toRow, toCol, piece) {
  const rowDiff = Math.abs(toRow - fromRow);
  const colDiff = Math.abs(toCol - fromCol);

  switch (piece.toLowerCase()) {
    case "p": // Pawn
      return rowDiff === 1 && colDiff === 0;
    case "r": // Rook
      return fromRow === toRow || fromCol === toCol;
    case "n": // Knight
      return rowDiff * colDiff === 2;
    case "b": // Bishop
      return rowDiff === colDiff;
    case "q": // Queen
      return fromRow === toRow || fromCol === toCol || rowDiff === colDiff;
    case "k": // King
      return rowDiff <= 1 && colDiff <= 1;
    default:
      return false;
  }
}

initBoard();
