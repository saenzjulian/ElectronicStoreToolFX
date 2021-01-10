package com.laynezcoder.estfx.resources;

import javafx.scene.effect.BoxBlur;

public class Constants {

    public static final String TITLE = "Electronic Store Tool FX";

    public static final String SOURCE_PACKAGES = "/com/laynezcoder/estfx";
    public static final String MEDIA_PACKAGE = SOURCE_PACKAGES + "/media/";
    public static final String VIEWS_PACKAGE = SOURCE_PACKAGES + "/views/";
    public static final String PROFILE_PICTURES_PACKAGE = MEDIA_PACKAGE + "profile/";
    public static final String RESOURCES_PACKAGE = SOURCE_PACKAGES + "/resources/";
    public static final String FONTS_PACKAGE = SOURCE_PACKAGES + "/fonts/";

    public static final String LOGIN_VIEW = VIEWS_PACKAGE + "LoginView.fxml";
    public static final String START_VIEW = VIEWS_PACKAGE + "StartView.fxml";
    public static final String MAIN_VIEW = VIEWS_PACKAGE + "MainView.fxml";

    public static final String STAGE_ICON = MEDIA_PACKAGE + "icon.png";
    public static final String NO_IMAGE_AVAILABLE = MEDIA_PACKAGE + "empty-image.jpg";
    public static final String INFORMATION_IMAGE = MEDIA_PACKAGE + "information.png";
    public static final String ERROR_IMAGE = MEDIA_PACKAGE + "error.png";
    public static final String SUCCESS_IMAGE = MEDIA_PACKAGE + "success.png";

    public static final String CSS_LIGHT_THEME = RESOURCES_PACKAGE + "LightTheme.css";
    public static final String LIGHT_THEME = Constants.class.getResource(CSS_LIGHT_THEME).toExternalForm();

    public static final String FONT = FONTS_PACKAGE + "rimouski.ttf";
    public static final String RIMOUSKI_FONT = Constants.class.getResource(FONT).toExternalForm();

    public static final String MESSAGE_ERROR_CONNECTION_MYSQL = "An error occurred when connecting to MySQL.\nCheck your connection to MySQL";
    public static final String MESSAGE_IMAGE_LARGE = "Please upload a picture smaller than 1 MB.";
    public static final String MESSAGE_IMAGE_NOT_FOUND = "Image not found. The record will be saved.";
    public static final String INSUFFICIENT_DATA = "Insufficient data";
    public static final String MESSAGE_NO_RECORD_SELECTED = "Select an item from the table.";

    public static final String MENSSAGE_ADDED = "Registry added successfully";
    public static final String MENSSAGE_UPDATED = "Registry updated successfully";
    public static final String MENSSAGE_DELETED = "Registry deleted successfully";

    public static final String EXISTENT = "Existent";
    public static final String NOT_EXISTENT = "Not existent";

    public static final String REALIZED = "Realized";
    public static final String NOT_REALIZED = "Not realized";

    public static final String REPORTED = "Reported";
    public static final String NOT_REPORTED = "Not reported";

    public static final BoxBlur BOX_BLUR_EFFECT = new BoxBlur(3, 3, 3);
}
