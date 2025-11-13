# git이란?
파일 버전 관리 툴

# git 명령어
1. git init : 명령어가 실행되는 경로에서 코드추적을 시작하겠다.
2. git add : 변경사항에 대해서 임시저장 -> 스테이징 영역에 저장
git add 경로/파일이름.java(정석적인 방법)
git add . : 모든 변경사항을 임시저장 하겠다.
3. git commit : 이때까지 add한 부분에 대해서 하나의 버전으로 저장

4. git remote add origin 깃허브저장소url
5. git push -u origin main : origin(원격저장소)와 main(로컬)을 동기화해서 전송하겠다.(최초 1회만 기입, 그 이후에는 git push만 입력)


# git 명령어
로컬환경 셋팅

1. 내 프로젝트를 git이 추적하게 만드는 것 - git init
2. 현재 작업자의 서명 등록
3.
git config --global user.name 내 아이디
git config --global user.email 내 이메일

내 컴퓨터에서 코드 작업(코드변경)을 함(로컬) -> 원격 레포지토리(github)에 게시

변경사항에 대해서 로컬에 임시저장한다(스테이징 영역에 올린다). -git add
add를 여러번 해서 한 화물차에 많은 짐을 싣게된다. -git add .
화물차 문을 닫고 출발준비(=스테이징 된 변경사항을 하나의 버전으로 포장) -git commit -m"커밋메세지"
화물차 문을 닫고 출발준비(=스테이징 된 변경사항을 하나의 버전으로 포장) -git commit -m"커밋메세지"
준비된 화물차들을 원격 레포지토리로 보낸다 (=로컬 커밋을 원격 저장소에 게시) -git push
최초 로컬 <> 원격 레포지토리 연결(git push 바로 직전에 수행)

본사 창고 주소를 등록한다(=원격 저장소 등록) git remote add origin 레포지토리주소(https://github.com/jungsw081088-sudo/korit_web1_java)
최초 push 시에만, git push -u origin main
다른 로컬에서 원격 레포지토리에 있는 코드를 다운로드하는 방법 git clone 원격레포지토리주소


Ctrl + Alt + L -> 정렬

파일에서 찾아 : 토큰

https://github.com/elikese / 강사님 깃허브
https://github.com/jungsw081088-sudo/korit_web1_java / 내 깃허브