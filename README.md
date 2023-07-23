# Instagram 
Created a simple application using Spring Initializer With required depencdencies that manages Users of an instagram and also post of an  instagram i.e., An User can perform some operation such as sign-In, sign-Up, update,add Post and get All Post etc.

## Frame Work And Language
* Spring Boot 
* Java-17

# Data Flow 
 ## Model
   * ### User
        * #### userId
        * #### userName
        * #### userHandle
        * #### userBio
        * #### email
        * #### phoneNumber
        * #### password
        * #### gender
        * #### accounttype
        * #### bluetick
   * ### Post
        * #### Id
        * #### postContent
        * #### postCaption
        * #### postType
        * #### location
        * #### postCreatedTimeStamp
        * #### postowner

    * #### Like
        * #### Id
        * #### instaPost
        * #### instaPost     
    * #### Follow
        * #### Id
        * #### currentUser
        * #### currentUserFollower
         * #### bluetick
   * ### Comment
        * #### Id
        * #### commentBody
        * #### commentCreationTimeStamp
        * #### instapost
        * #### commenter
            
   * ### Authentication Token
        * #### tokenId
        * #### token
        * #### tokenCreationDate
        * #### @OneToOne -> User 

   * ### Authentication Token
        * #### Id
        * #### adminname
        * #### adminEmail
        * #### adminPassword     
 * ## Dto
   * ### SignInInput 
     * #### email
     * #### password
   * ### SignUpOutput  
     * #### signUpStatus
     * #### signUpStatusMessage  
                
## Controller
  * ### User Controller
    * #### signInInstaUser
    * #### signUpInstaUser
    * #### sigOutInstaUser
    * #### createInstaPost
    * #### removeInstaPost
    * #### addComment
    * #### removeInstaComment
    * #### addLike
    * #### getLikeCountByPost
    * #### removeInstaLike
    * #### FollowUser
    * #### unFollowUser
  * ### Admin Controller
    
## Service 
  * ### User Service
    * Sign In user
    * Sign up user 
    * Sign Out User
    * createInstaPost
    * Update User
    * Get all Posts 
 * ### Post Service
   * Add post
 * ### Authentication Service
   * Save Token
   * authenticate 
## Data Structure
* String
* int
* long 

## Authors

- [@Rudra Pratap Singh](https://github.com/rudrapratapsingh2000)

