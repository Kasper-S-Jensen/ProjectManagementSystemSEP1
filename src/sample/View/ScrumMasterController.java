package sample.View;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import sample.Model.*;

public class ScrumMasterController
{

  @FXML private ChoiceBox requirementPriority;
  @FXML private ChoiceBox requirementStatus;
  @FXML private ChoiceBox taskPriority;
  @FXML private ChoiceBox responsibleTeamMember;
  @FXML private Button cancel;
  @FXML private Button approveRequirement;
  @FXML private Button logOut;
  @FXML private TableView requirementTable;
  @FXML private TableView taskTable;
  @FXML private TextField inputTaskName;
  @FXML private TextField inputTaskID;
  @FXML private TextField inputDay;
  @FXML private TextField inputMonth;
  @FXML private TextField inputYear;
  @FXML private TextField approveTask;
  @FXML private TextField estimatedCompletionTime;

  private ManagementSystemModel model;
  private ViewHandler viewHandler;
  private Region root;
  private Requirement chosenRequirement;
  private Project chosenProject;


  public void setModel( ManagementSystemModel model)
  {
    this.model = model;
  }

  public void setViewHandler(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  public void init(ViewHandler viewHandler, ManagementSystemModel model, Region root)
  {
    this.viewHandler = viewHandler;
    this.model = model;
    this.root = root;
  }

  public Region getRoot()
  {
    return root;
  }


  public void setCancel()
  {
    Stage stage = (Stage) cancel.getScene().getWindow();
    stage.close();
  }



  public void addTask()
  {
    model.get
  }

  public void logOut()
  {
    viewHandler.openView("main");
  }

}
