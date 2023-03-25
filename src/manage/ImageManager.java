package manage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This class manages images of chess pieces
 */
public class ImageManager {

    // Map that associates each chess piece with its image representation
    private static Map<Pieces, BufferedImage> pieceImages;

    // Method to load all the images of chess pieces
    public static void loadImages() throws IOException {
        // Initialize the map to an empty HashMap
        pieceImages = new HashMap<>();

        // Load the image for each chess piece and put it in the map with the corresponding key
        pieceImages.put(Pieces.PAWN, loadImage("/images/pieces/pawn.png"));
        pieceImages.put(Pieces.BISHOP, loadImage("/images/pieces/bishop.png"));
        pieceImages.put(Pieces.KNIGHT, loadImage("/images/pieces/knight.png"));
        pieceImages.put(Pieces.ROOK, loadImage("/images/pieces/rook.png"));
        pieceImages.put(Pieces.QUEEN, loadImage("/images/pieces/queen.png"));
        pieceImages.put(Pieces.KING, loadImage("/images/pieces/king.png"));
        pieceImages.put(Pieces.PAWN_BLACK, loadImage("/images/pieces/pawn_BLACK.png"));
        pieceImages.put(Pieces.BISHOP_BLACK, loadImage("/images/pieces/bishop_BLACK.png"));
        pieceImages.put(Pieces.KNIGHT_BLACK, loadImage("/images/pieces/knight_BLACK.png"));
        pieceImages.put(Pieces.ROOK_BLACK, loadImage("/images/pieces/rook_BLACK.png"));
        pieceImages.put(Pieces.QUEEN_BLACK, loadImage("/images/pieces/queen_BLACK.png"));
        pieceImages.put(Pieces.KING_BLACK, loadImage("/images/pieces/king_BLACK.png"));
    }

    // Method to load a single image given its file path
    private static BufferedImage loadImage(String path) throws IOException {
        // Use the ImageIO class to read the image from the file path
        // The getResourceAsStream method finds the resource with a given name relative to this class file
        return ImageIO.read(Objects.requireNonNull(ImageManager.class.getResourceAsStream(path)));
    }

    /**
     * Method to get the image for a specific chess piece
     *
     * @return returns the image of the given chess piece
     */
    public static BufferedImage getPiece(Pieces piece) {
        return pieceImages.get(piece);
    }
}
