SUMMARY = "Volumio is an headless audiophile music player"
HOMEPAGE = "https://volumio.org"
BUGTRACKER = "https://github.com/volumio/Volumio2/issues"
SECTION = "multimedia/player"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=074835f46153bc7bf84c03709d593e7d"

RDEPENDS_${PN} += " nodejs"

SRC_URI = "git://github.com/volumio/Volumio2.git;protocol=https"

inherit npm-base

do_install() {
	     oe_runnpm install     # Installs dependencies defined in package.json
}