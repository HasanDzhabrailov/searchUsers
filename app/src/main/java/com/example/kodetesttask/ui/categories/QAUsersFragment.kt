package com.example.kodetesttask.ui.categories

import com.example.kodetesttask.ui.users.UsersListFragment

class QAUsersFragment : UsersListFragment() {

	override fun getCategory(): String {
		return "qa"
	}
}