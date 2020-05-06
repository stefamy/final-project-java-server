package com.example.wbdvsp20astefanifinalprojectserver.models;


public class Guest {

  private Integer inviteId;
  private Integer eventId;
  private Integer guestId;
  private String response;
  private String comments;
  private String invitationDate;
  private String username;
  private Integer accountClaimed;
  private String firstName;
  private String lastName;
  private String email;

  public Guest(Integer inviteId, Integer eventId, Integer guestId, String response,
      String comments, String invitationDate, String username, Integer accountClaimed,
      String firstName, String lastName, String email) {
    this.inviteId = inviteId;
    this.eventId = eventId;
    this.guestId = guestId;
    this.response = response;
    this.comments = comments;
    this.invitationDate = invitationDate;
    this.username = username;
    this.accountClaimed = accountClaimed;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public Guest(Integer eventId, Integer guestId) {
    this.eventId = eventId;
    this.guestId = guestId;
  }

  public Guest(Integer inviteId) {
    this.inviteId = inviteId;
  }

  public Guest() {}

  public Guest(User user, Invite invite) {
    this.inviteId = invite.getId();
    this.eventId = invite.getEventId();
    this.guestId = invite.getGuestId();
    this.response = invite.getResponse();
    this.comments = invite.getComments();
    this.invitationDate = invite.getInvitationDate();
    this.username = user.getUsername();
    this.accountClaimed = user.getAccountClaimed();
    this.firstName = user.getFirstName();
    this.lastName = user.getLastName();
    this.email = user.getEmail();
  }


  public Integer getInviteId() {
    return inviteId;
  }

  public void setInviteId(Integer inviteId) {
    this.inviteId = inviteId;
  }

  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public Integer getGuestId() {
    return guestId;
  }

  public void setGuestId(Integer guestId) {
    this.guestId = guestId;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public String getInvitationDate() {
    return invitationDate;
  }

  public void setInvitationDate(String invitationDate) {
    this.invitationDate = invitationDate;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getAccountClaimed() {
    return accountClaimed;
  }

  public void setAccountClaimed(Integer accountClaimed) {
    this.accountClaimed = accountClaimed;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public User createUser() {
    User user = new User();
    user.setId(this.getGuestId());
    user.setFirstName(this.getFirstName());
    user.setLastName(this.getLastName());
    user.setEmail(this.getEmail());
    user.setUsername(this.getEmail());
    user.setAccountClaimed(this.getAccountClaimed());
    return user;
  }

  public Invite createInvite() {
    Invite invite = new Invite();
    invite.setId(this.getInviteId());
    invite.setGuestId(this.getGuestId());
    invite.setEventId(this.getEventId());
    invite.setResponse(this.getResponse());
    invite.setComments(this.getComments());
    invite.setInvitationDate(this.getInvitationDate());

    return invite;
  }

}


