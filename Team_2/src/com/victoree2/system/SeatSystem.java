package com.victoree2.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeatSystem {
	
	public String firstBraket = "[";
	private String seat;//좌석번호
	private int roomarr;//열람실
	private boolean pnp; 
	private int indexX;
	public int getIndexX() {
		return indexX;
	}

	public void setIndexX(int indexX) {
		this.indexX = indexX;
	}

	public int getIndexY() {
		return indexY;
	}

	public void setIndexY(int indexY) {
		this.indexY = indexY;
	}

	private int indexY;

	public String getSeat() {
		return seat;
	}

	public int getRoomarr() {
		return roomarr;
	}

	public String lastBraket = "]";	
	private int cnt;
	private List<String[][]> roomNum = new ArrayList<String[][]>(); //다형성 //열람실 번호 roomNum


	private String deskIndex1[][] = new String[6][9]; //좌석 번호 //세로열 [0~2], 가로열[0~6] 
	private String deskIndex2[][] = new String[4][6]; //좌석 번호 //세로열 [0~3], 가로열[0~5]
	private String deskIndex3[][] = new String[5][5]; //좌석 번호 //세로열 [0~4], 가로열[0~4]
	
	Scanner scan = new Scanner(System.in);
	
	void init() { //초기과 좌석 배열
		cnt = 1;
		
		//1열람실 좌석 배열 arr1
		for (int i = 0; i <deskIndex1.length; i++) {
			for (int j = 0; j <deskIndex1[i].length; j++) {
				deskIndex1[i][j] =firstBraket + (String.valueOf(cnt++)) + lastBraket;
				//System.out.print(deskIndex1[i][j]);
			}
		}
		cnt=1;
		
		//2열람실 좌석 배열 arr2
		for (int i = 0; i <deskIndex2.length; i++) {
			for (int j = 0; j <deskIndex2[i].length; j++) {
				deskIndex2[i][j] =firstBraket + (String.valueOf(cnt++)) + lastBraket;
			}
		}
		cnt=1;
		//3열람실 좌석 배열 arr3
		for (int i = 0; i <deskIndex3.length; i++) {
			for (int j = 0; j <deskIndex3[i].length; j++) {
				deskIndex3[i][j] =firstBraket + (String.valueOf(cnt++)) + lastBraket;
			}
		}
		cnt=1;
		  roomNum.add(deskIndex1);
		  roomNum.add(deskIndex2);
		  roomNum.add(deskIndex3);
	}

	public List<String[][]> getRoomNum() {
		return roomNum;
	}

	public void makeRoom(int x, int y) {
		String temp[][] = new String[y][x];
		int room = 1;
		
		for(int i = 0 ; i < temp.length ; i++) {
			for(int j = 0 ; j < temp[i].length ; j++) {
				temp[i][j] = "[" + room +"]";
				room++;
			}
		}
		roomNum.add(temp);
	}
	
	public void print(int room) {
		String tmp[][] = roomNum.get(room-1);
		
		for(int i = 0 ; i < tmp.length ; i++) {
			for(int j = 0 ; j < tmp[i].length ; j++) {
				System.out.print(tmp[i][j]+"\t"); //자리 이쁘게 표현하기
			}
			System.out.println();
		}
	}
	
	
	
	///
	public void update(int room) {
		pnp = true; // [사용중] 좌석 선택시 다시 돌도록.

		while (pnp == true) {
			seat = scan.nextLine();
			roomarr = room;
			String tempSeat = "[" + seat + "]";
			String tmp[][] = roomNum.get(room - 1);

			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					if (tmp[i][j].equals(tempSeat)) {
						pnp = false;
						tmp[i][j] = "[" + "사용중" + "]";
						indexX = i;
						indexY = j;
					}

				}
			}
		}

	}

	//시스템 시작시 좌석 초기화값

	public void update(int roomarr, String seat) {
		
		boolean pnp = true; // [사용중] 좌석 선택시 다시 돌도록.

		while (pnp == true) {
			String tempSeat = "[" + seat + "]";
			String tmp[][] = roomNum.get(roomarr - 1);

			for (int i = 0; i < tmp.length; i++) {
				for (int j = 0; j < tmp[i].length; j++) {
					if (tmp[i][j].equals(tempSeat)) {
						pnp = false;
						tmp[i][j] = "[" + "사용중" + "]";
					}

				}
			}
		}
	}

	
	//좌석반환
	
	public void update(int roomarr, int indexX, int indexY) {
		
			String tmp[][] = roomNum.get(roomarr - 1);
			int cnt=1;
			
			for(int i =0 ; i < indexX; i++)
			{
				for(int j =0 ; j < indexY; j++)
					cnt++;
			}
			
			tmp[indexX][indexY] = "[" + cnt +"]";			
	}
	
}
