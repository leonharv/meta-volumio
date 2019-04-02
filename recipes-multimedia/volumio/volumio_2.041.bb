SUMMARY = "Volumio is an headless audiophile music player"
HOMEPAGE = "https://volumio.org"
BUGTRACKER = "https://github.com/volumio/Volumio2/issues"
SECTION = "multimedia/player"
LICENSE = "GPLv3+"

RDEPENDS_${PN} = "nodejs"

SRC_URI = "https://github.com/volumio/Volumio2/archive/${PV}.tar.gz;downloadfilename=volumio_${PV}.tar.gz"

SRC_URI[md5sum] = "645a70c5ebda86d826dd281c106147fd"
SRC_URI[sha256sum] = "3c16f205576b30ce74201c192d592690a8f0f6d6d306b66425830fed2b65d1bb"

inherit npm

S = "${WORKDIR}/Volumio2-2.041"

LIC_FILES_CHKSUM = "file://LICENSE.md;md5=074835f46153bc7bf84c03709d593e7d"

