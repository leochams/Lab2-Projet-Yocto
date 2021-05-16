DESCRIPTION = "Hello Ynov programme"
LICENSE = "" # "Choose wisely" Monty Python, vous connaissez la référence ou non!
LIC_FILES_CHKSUM = "file://home/linuxmint/yocto/poky/meta/files/common-licenses;md5=0835ade698e0bcf8506ecda2f7b4f302" # Faites vos recherches et remplissez cette variable

# Rajouter le lien vers votre fichier
SRC_URI = "file://home/linuxmint/bachelor-embedded-linux/labs/lab2/meta-ynov-rpi4/recipe-ynov/files"

S = "${WORKDIR}"

do_compile() {
	# Cadeaux, je vous donne la commande pour compiler
	${CC} hello.c ${LDFLAGS} -o hello
}

# installe le programme dans /usr/bin 
do_install() {
	install -d ${D}${bindir}
        install -m 0755 hello ${D}${bindir}
}
