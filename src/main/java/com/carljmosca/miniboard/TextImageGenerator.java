/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carljmosca.miniboard;

import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 *
 * @author moscac
 */
public class TextImageGenerator {

    public static ImageView textToImage(String message) {
        
        final Text text = new Text(message);
        text.setFont(Font.font("Georgia", 26));

        final ImageView scaled = createScaledView(text, 4);
        return scaled;
    }

    private static ImageView createScaledView(Node node, int scale) {
        final Bounds bounds = node.getLayoutBounds();

        final WritableImage image = new WritableImage(
                (int) Math.round(bounds.getWidth() * scale),
                (int) Math.round(bounds.getHeight() * scale));

        final SnapshotParameters spa = new SnapshotParameters();
        spa.setTransform(javafx.scene.transform.Transform.scale(scale, scale));

        final ImageView view = new ImageView(node.snapshot(spa, image));
        view.setFitWidth(bounds.getWidth());
        view.setFitHeight(bounds.getHeight());

        return view;
    }
}
